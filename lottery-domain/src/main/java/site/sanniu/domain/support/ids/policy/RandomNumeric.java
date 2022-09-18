package site.sanniu.domain.support.ids.policy;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;
import site.sanniu.domain.support.ids.IIdGenerator;

/**
 * @Author sanniu
 * @Description 工具类生成 org.apache.commons.lang3.RandomStringUtils
 * @Date $ $
 **/
@Component
public class RandomNumeric implements IIdGenerator {

    @Override
    public long nextId() {
        return Long.parseLong(RandomStringUtils.randomNumeric(11));
    }

}

