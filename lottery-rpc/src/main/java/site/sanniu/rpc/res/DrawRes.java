package site.sanniu.rpc.res;

import site.sanniu.common.Result;
import site.sanniu.rpc.dto.AwardDTO;

import java.io.Serializable;

/**
 * @Author sanniu
 * @Description //TODO $
 * @Date $ $
 **/
public class DrawRes extends Result implements Serializable {

    private AwardDTO awardDTO;

    public DrawRes(String code, String info) {
        super(code, info);
    }

    public AwardDTO getAwardDTO() {
        return awardDTO;
    }

    public void setAwardDTO(AwardDTO awardDTO) {
        this.awardDTO = awardDTO;
    }

}

