package org.rikka.handler;

import org.rikka.data.IData;

public interface IDataHandler {

    IData getTData();

    IData getSData();

    void copy(IDataHandler data);

}
