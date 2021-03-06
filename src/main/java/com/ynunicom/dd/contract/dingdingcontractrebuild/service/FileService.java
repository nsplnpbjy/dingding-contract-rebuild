package com.ynunicom.dd.contract.dingdingcontractrebuild.service;

import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

/**
 * @author: jinye.Bai
 * @date: 2020/6/28 16:56
 */
public interface FileService {

    public boolean del(String accessToken, String fileName, String userId,String contractId,String taskId);

    public HttpServletResponse getDoc(String accessToken, String fileName, HttpServletResponse httpServletResponse,String userId);

    public HttpServletResponse getPdf(String accessToken, String fileName, HttpServletResponse httpServletResponse,String userId);

    public HttpServletResponse getOther(String accessToken, String fileName, HttpServletResponse httpServletResponse,String userId);

    public boolean push(String accessToken, String mediaId, String fileName, String recvUserId);
}
