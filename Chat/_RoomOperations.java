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

public interface _RoomOperations
{
    boolean login(String user, CMDReceiverPrx receiver, Ice.Current __current);

    void logout(String user, Ice.Current __current);

    void sendCMD(String user, String CMD, Ice.Current __current);
}
