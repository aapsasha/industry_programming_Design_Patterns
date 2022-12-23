package org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidActions;

import org.aapsasha.abstractFactory.Platforms.IParts.Actions.ISuperAction;

public class AndroidSuperAction extends ISuperAction {
    @Override
    public String toString(){
        return "IOS " + super.toString();
    }
}
