package site.sanniu.application.process.res;

import site.sanniu.common.Result;
import site.sanniu.domain.strategy.model.vo.DrawAwardVO;

/**
 * @Author sanniu
 * @Description 活动抽奖结果
 * @Date $ $
 **/
public class DrawProcessResult extends Result {

    private DrawAwardVO drawAwardVO;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardVO drawAwardVO) {
        super(code, info);
        this.drawAwardVO = drawAwardVO;
    }

    public DrawAwardVO getDrawAwardVO() {
        return drawAwardVO;
    }

    public void setDrawAwardVO(DrawAwardVO drawAwardVO) {
        this.drawAwardVO = drawAwardVO;
    }

}

