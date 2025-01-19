package com.sehoon.admintempleteserver.module.sample.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sehoon.admintempleteserver.common.pagination.ReqPagination;
import com.sehoon.admintempleteserver.module.sample.service.SampleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * sample 컨트롤러
 */
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/sample")
public class SampleController {

    private final SampleService sampleService;

    /**
     * {@code GET /api/sample/hello-world} : get hello-world text
     *
     * @param
     * @return
     */
    @GetMapping("/hello-world")
    public String helloWorld() {
        log.debug("hihi");
        String word = "hello-world!!";
        return word;
    }

    /**
     * {@code GET /action_name} : echo
     *
     * @param
     * @return
     */
    @RequestMapping(value = "echo", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = {
            RequestMethod.GET, RequestMethod.POST,
            RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS })
    public ResponseEntity<?> echoBack1(@RequestBody(required = false) byte[] rawBody) {
        log.debug("echoBack start " + new String(rawBody));

        return ResponseEntity.status(HttpStatus.OK).body(new String(rawBody));
    }

    @GetMapping("/get-user")
    public Map<String, Object> getSample(@RequestParam int id) {
        return sampleService.getSampleById(1);
    }
    
    @GetMapping("/dummy/table/list")
    public ResponseEntity<?> getDummyTableList(
            @RequestParam int page,
            @RequestParam int pageSize,
            @RequestParam(required = false) Integer category,
            @RequestParam(required = false) String start,
            @RequestParam(required = false) String end) {
        ReqPagination pagination = new ReqPagination(page, pageSize);
        Map<String, Object> result = sampleService.getDummyTableList(pagination, category, start, end);
        return ResponseEntity.ok(result);
    }
}
