package org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSActions;

import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IAction;

public class IOSAction extends IAction {
    @Override
    public String toString(){
        return "IOS " + super.toString();
    }
}
