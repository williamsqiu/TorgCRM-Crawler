package ru.torgcrm.crawler.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import ru.torgcrm.crawler.dto.WebsiteDTO;

@Component
@SessionScope
public class WebsiteModel extends BaseModel<WebsiteDTO> {
}
