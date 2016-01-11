// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.1
//
// <auto-generated>
//
// Generated from file `Printer.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Chat;

public interface MessageReceiverPrx extends Ice.ObjectPrx
{
    public void onMessage(String sender, String msg);

    public void onMessage(String sender, String msg, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_onMessage(String sender, String msg);

    public Ice.AsyncResult begin_onMessage(String sender, String msg, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_onMessage(String sender, String msg, Ice.Callback __cb);

    public Ice.AsyncResult begin_onMessage(String sender, String msg, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_onMessage(String sender, String msg, Callback_MessageReceiver_onMessage __cb);

    public Ice.AsyncResult begin_onMessage(String sender, String msg, java.util.Map<String, String> __ctx, Callback_MessageReceiver_onMessage __cb);

    public Ice.AsyncResult begin_onMessage(String sender, 
                                           String msg, 
                                           IceInternal.Functional_VoidCallback __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_onMessage(String sender, 
                                           String msg, 
                                           IceInternal.Functional_VoidCallback __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_onMessage(String sender, 
                                           String msg, 
                                           java.util.Map<String, String> __ctx, 
                                           IceInternal.Functional_VoidCallback __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_onMessage(String sender, 
                                           String msg, 
                                           java.util.Map<String, String> __ctx, 
                                           IceInternal.Functional_VoidCallback __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb);

    public void end_onMessage(Ice.AsyncResult __result);
}