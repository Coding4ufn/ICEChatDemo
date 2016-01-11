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
// Generated from file `Chat.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Chat;

public final class CMDReceiverPrxHelper extends Ice.ObjectPrxHelperBase implements CMDReceiverPrx
{
    private static final String __onCMD_name = "onCMD";

    public void onCMD(String sender, String cmd)
    {
        onCMD(sender, cmd, null, false);
    }

    public void onCMD(String sender, String cmd, java.util.Map<String, String> __ctx)
    {
        onCMD(sender, cmd, __ctx, true);
    }

    private void onCMD(String sender, String cmd, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_onCMD(begin_onCMD(sender, cmd, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_onCMD(String sender, String cmd)
    {
        return begin_onCMD(sender, cmd, null, false, false, null);
    }

    public Ice.AsyncResult begin_onCMD(String sender, String cmd, java.util.Map<String, String> __ctx)
    {
        return begin_onCMD(sender, cmd, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_onCMD(String sender, String cmd, Ice.Callback __cb)
    {
        return begin_onCMD(sender, cmd, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_onCMD(String sender, String cmd, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_onCMD(sender, cmd, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_onCMD(String sender, String cmd, Callback_CMDReceiver_onCMD __cb)
    {
        return begin_onCMD(sender, cmd, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_onCMD(String sender, String cmd, java.util.Map<String, String> __ctx, Callback_CMDReceiver_onCMD __cb)
    {
        return begin_onCMD(sender, cmd, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_onCMD(String sender, 
                                       String cmd, 
                                       IceInternal.Functional_VoidCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_onCMD(sender, cmd, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_onCMD(String sender, 
                                       String cmd, 
                                       IceInternal.Functional_VoidCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_onCMD(sender, cmd, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_onCMD(String sender, 
                                       String cmd, 
                                       java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_VoidCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_onCMD(sender, cmd, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_onCMD(String sender, 
                                       String cmd, 
                                       java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_VoidCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_onCMD(sender, cmd, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_onCMD(String sender, 
                                        String cmd, 
                                        java.util.Map<String, String> __ctx, 
                                        boolean __explicitCtx, 
                                        boolean __synchronous, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_onCMD(sender, 
                           cmd, 
                           __ctx, 
                           __explicitCtx, 
                           __synchronous, 
                           new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_onCMD(String sender, 
                                        String cmd, 
                                        java.util.Map<String, String> __ctx, 
                                        boolean __explicitCtx, 
                                        boolean __synchronous, 
                                        IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__onCMD_name, __cb);
        try
        {
            __result.prepare(__onCMD_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(sender);
            __os.writeString(cmd);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_onCMD(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __onCMD_name);
    }

    public static CMDReceiverPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), CMDReceiverPrx.class, CMDReceiverPrxHelper.class);
    }

    public static CMDReceiverPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), CMDReceiverPrx.class, CMDReceiverPrxHelper.class);
    }

    public static CMDReceiverPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), CMDReceiverPrx.class, CMDReceiverPrxHelper.class);
    }

    public static CMDReceiverPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), CMDReceiverPrx.class, CMDReceiverPrxHelper.class);
    }

    public static CMDReceiverPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, CMDReceiverPrx.class, CMDReceiverPrxHelper.class);
    }

    public static CMDReceiverPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, CMDReceiverPrx.class, CMDReceiverPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Chat::CMDReceiver",
        "::Ice::Object"
    };

    public static String ice_staticId()
    {
        return __ids[0];
    }

    public static void __write(IceInternal.BasicStream __os, CMDReceiverPrx v)
    {
        __os.writeProxy(v);
    }

    public static CMDReceiverPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            CMDReceiverPrxHelper result = new CMDReceiverPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
