package org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSActions;

import org.aapsasha.abstractFactory.Platforms.IParts.Actions.ISuperAction;

public class IOSSuperAction extends ISuperAction {
    @Override
    public String toString(){
        return "IOS " + super.toString();
    }
}
