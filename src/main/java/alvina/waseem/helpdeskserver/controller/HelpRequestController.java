package alvina.waseem.helpdeskserver.controller;

import alvina.waseem.helpdeskserver.model.HelpRequest;
import alvina.waseem.helpdeskserver.service.HelpRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/help")
@CrossOrigin("*")
public class HelpRequestController {

    private HelpRequestService helpRequestService;

    @Autowired
    public HelpRequestController(HelpRequestService helpRequestService){
        this.helpRequestService = helpRequestService;
    }

    @GetMapping("")
    public ResponseEntity<Iterable<HelpRequest>> getAll(){
        Iterable<HelpRequest> allRequest = helpRequestService.getAll();
        return new ResponseEntity<>(allRequest, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HelpRequest> create(@RequestBody HelpRequest helpRequest){
        helpRequest = helpRequestService.create(helpRequest);
        return new ResponseEntity<>(helpRequest,HttpStatus.CREATED);
    }
}
