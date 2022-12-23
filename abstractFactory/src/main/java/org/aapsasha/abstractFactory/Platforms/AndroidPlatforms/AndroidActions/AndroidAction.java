package org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidActions;

import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IAction;

public class AndroidAction extends IAction {
    @Override
    public String toString(){
        return "IOS " + super.toString();
    }
}
