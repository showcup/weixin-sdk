package com.riversoft.weixin.pay.payment.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @borball on 5/15/2016.
 */
public class UnifiedOrderRequest {

    /**
     * 终端设备号(门店号或收银设备ID)，注意：PC网页或公众号内支付请传"WEB"
     */
    @JsonProperty("device_info")
    private String deviceInfo;

    private String body;
    private String detail;
    private String attach;

    @JsonProperty("out_trade_no")
    private String tradeNumber;

    @JsonProperty("fee_type")
    private String feeType;

    @JsonProperty("total_fee")
    private int totalFee;

    /**
     * APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP
     */
    @JsonProperty("spbill_create_ip")
    private String billCreatedIp;

    @JsonProperty("time_start")
    private String timeStart;

    @JsonProperty("time_expire")
    private String timeExpire;

    @JsonProperty("goods_tag")
    private String goodsTag;

    @JsonProperty("notify_url")
    private String notifyUrl;

    @JsonProperty("trade_type")
    private String tradeType;

    /**
     * trade_type=NATIVE时（即扫码支付），此参数必传。此参数为二维码中包含的商品ID，商户自行定义
     */
    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("limit_pay")
    private String limitPay;

    /**
     * trade_type=JSAPI时（即公众号支付或者小程序支付），此参数必传，此参数为微信用户在商户对应appid下的唯一标识。
     */
    @JsonProperty("openid")
    private String openId;
    
    /**
     * 该字段用于上报场景信息，目前支持上报实际门店信息。该字段为JSON对象数据，对象格式为{"store_info":{"id": "门店ID","name": "名称","area_code": "编码","address": "地址" }} 
     */
    @JsonProperty("scene_info")
    private String sceneInfo;
    
    //===以下为服务商接口新增参数===//
    
    /**
     * 微信分配的子商户公众账号ID，如需在支付完成后获取sub_openid则此参数必传。
     */
    @JsonProperty("sub_appid")
    private String subAppId;
    
    /**
     * 微信支付分配的子商户号
     */
    @JsonProperty("sub_mch_id")
    private String subMchId;

    /**
     * trade_type=JSAPI，此参数必传，用户在子商户appid下的唯一标识。openid和sub_openid可以选传其中之一，如果选择传sub_openid,则必须传sub_appid。下单前需要调用【网页授权获取用户信息】接口获取到用户的Openid。 
     */
    @JsonProperty("sub_openid")
    private String subOpenId;
    
    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTradeNumber() {
        return tradeNumber;
    }

    public void setTradeNumber(String tradeNumber) {
        this.tradeNumber = tradeNumber;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public String getBillCreatedIp() {
        return billCreatedIp;
    }

    public void setBillCreatedIp(String billCreatedIp) {
        this.billCreatedIp = billCreatedIp;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

	public String getSceneInfo() {
		return sceneInfo;
	}

	public void setSceneInfo(String sceneInfo) {
		this.sceneInfo = sceneInfo;
	}

	public String getSubAppId() {
		return subAppId;
	}

	public void setSubAppId(String subAppId) {
		this.subAppId = subAppId;
	}

	public String getSubMchId() {
		return subMchId;
	}

	public void setSubMchId(String subMchId) {
		this.subMchId = subMchId;
	}

	public String getSubOpenId() {
		return subOpenId;
	}

	public void setSubOpenId(String subOpenId) {
		this.subOpenId = subOpenId;
	}
}
