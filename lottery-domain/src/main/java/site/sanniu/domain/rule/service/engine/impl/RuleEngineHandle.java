package site.sanniu.domain.rule.service.engine.impl;

import org.springframework.stereotype.Service;
import site.sanniu.domain.rule.model.aggregates.TreeRuleRich;
import site.sanniu.domain.rule.model.req.DecisionMatterReq;
import site.sanniu.domain.rule.model.res.EngineResult;
import site.sanniu.domain.rule.model.vo.TreeNodeVO;
import site.sanniu.domain.rule.repository.IRuleRepository;
import site.sanniu.domain.rule.service.engine.EngineBase;

import javax.annotation.Resource;

/**
 * @Author sanniu
 * @Description 规则引擎处理器
 * @Date $ $
 **/
@Service("ruleEngineHandle")
public class RuleEngineHandle extends EngineBase {

    @Resource
    private IRuleRepository ruleRepository;

    @Override
    public EngineResult process(DecisionMatterReq matter) {
        // 决策规则树
        TreeRuleRich treeRuleRich = ruleRepository.queryTreeRuleRich(matter.getTreeId());
        if (null == treeRuleRich) {
            throw new RuntimeException("Tree Rule is null!");
        }

        // 决策节点
        TreeNodeVO treeNodeInfo = engineDecisionMaker(treeRuleRich, matter);

        // 决策结果
        return new EngineResult(matter.getUserId(), treeNodeInfo.getTreeId(), treeNodeInfo.getTreeNodeId(), treeNodeInfo.getNodeValue());
    }

}

