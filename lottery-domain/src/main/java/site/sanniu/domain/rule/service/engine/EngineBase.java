package site.sanniu.domain.rule.service.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import site.sanniu.common.Constants;
import site.sanniu.domain.rule.model.aggregates.TreeRuleRich;
import site.sanniu.domain.rule.model.req.DecisionMatterReq;
import site.sanniu.domain.rule.model.res.EngineResult;
import site.sanniu.domain.rule.model.vo.TreeNodeVO;
import site.sanniu.domain.rule.model.vo.TreeRootVO;
import site.sanniu.domain.rule.service.logic.LogicFilter;

import java.util.Map;

/**
 * @Author sanniu
 * @Description //TODO $
 * @Date $ $
 **/
public abstract class EngineBase extends EngineConfig implements EngineFilter {

    private Logger logger = LoggerFactory.getLogger(EngineBase.class);

    @Override
    public EngineResult process(DecisionMatterReq matter) {
        throw new RuntimeException("未实现规则引擎服务");
    }

    protected TreeNodeVO engineDecisionMaker(TreeRuleRich treeRuleRich, DecisionMatterReq matter) {
        TreeRootVO treeRoot = treeRuleRich.getTreeRoot();
        Map<Long, TreeNodeVO> treeNodeMap = treeRuleRich.getTreeNodeMap();

        // 规则树根ID
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNodeVO treeNodeInfo = treeNodeMap.get(rootNodeId);

        // 节点类型[NodeType]；1子叶、2果实
        while (Constants.NodeType.STEM.equals(treeNodeInfo.getNodeType())) {
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(matter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLineInfoList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            logger.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), matter.getUserId(), matter.getTreeId(), treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
        }

        return treeNodeInfo;
    }

}

