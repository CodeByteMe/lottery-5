package site.sanniu.rpc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.sanniu.application.process.IActivityProcess;
import site.sanniu.application.process.req.DrawProcessReq;
import site.sanniu.application.process.res.DrawProcessResult;

/**
 * @Author sanniu
 * @Description //TODO $
 * @Date $ $
 **/
@Controller
@RequestMapping("activityProcess")
public class ActivityProcessController {

    private final IActivityProcess activityProcess;

    public ActivityProcessController(IActivityProcess activityProcess) {
        this.activityProcess = activityProcess;
    }

    @PostMapping("doDrawProcess")
    @ResponseBody
    public DrawProcessResult doDrawProcess(@RequestBody DrawProcessReq req){
        return activityProcess.doDrawProcess(req);
    }
}
