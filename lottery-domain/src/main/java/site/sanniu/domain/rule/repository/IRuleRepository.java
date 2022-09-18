package site.sanniu.domain.rule.repository;

import site.sanniu.domain.rule.model.aggregates.TreeRuleRich;

/**
 * @Author sanniu
 * @Description //TODO $
 * @Date $ $
 **/
public interface IRuleRepository {

    /**
     * 查询规则决策树配置
     *
     * @param treeId    决策树ID
     * @return          决策树配置
     */
    TreeRuleRich queryTreeRuleRich(Long treeId);


}
