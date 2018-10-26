package com.util;

import com.constant.CommonConstant;
import com.exception.HomeinnsException;

/**
 * @author：linma
 * @date: 2018/10/24 15:06
 * @email: inma@homeinns.com
 **/
public class ResultUtils {

    /**
     * 请求成功
     *
     * @param data 需要传出的数据
     * @return
     */
    public static ResultVO success(Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(CommonConstant.REQUEST_OK);
        resultVO.setMessage(CommonConstant.Message.REQUEST_OK_MESSAGE);
        resultVO.setData(data);
        return resultVO;
    }

    /**
     * 请求失败
     *
     * @param e
     * @return
     */
    public static ResultVO failure(HomeinnsException e) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(e.getCode());
        resultVO.setMessage(e.getMessage());
        return resultVO;
    }


}
