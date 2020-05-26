package com.learn.provider;

import com.learn.api.IPaymentService;

@RpcService(IPaymentService.class)
public class PaymentServiceImpl implements IPaymentService{
    @Override
    public void doPay() {
        System.out.println("执行doPay方法");
    }
}
