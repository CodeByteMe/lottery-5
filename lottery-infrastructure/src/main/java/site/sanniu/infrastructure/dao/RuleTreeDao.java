package site.sanniu.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import site.sanniu.infrastructure.po.RuleTree;

/**
 * @Author sanniu
 * @Description //TODO $
 * @Date $ $
 **/
@Mapper
public interface RuleTreeDao {

    /**
     * 规则树查询
     * @param id ID
     * @return   规则树
     */
    RuleTree queryRuleTreeByTreeId(Long id);

    /**
     * 规则树简要信息查询
     * @param treeId 规则树ID
     * @return       规则树
     */
    RuleTree queryTreeSummaryInfo(Long treeId);

}

