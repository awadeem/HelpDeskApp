package alvina.waseem.helpdeskserver.service;

import alvina.waseem.helpdeskserver.model.HelpRequest;

import java.util.List;

public interface HelpRequestService {
    HelpRequest create (HelpRequest helpRequest);
    Iterable<HelpRequest> getAll();

}
