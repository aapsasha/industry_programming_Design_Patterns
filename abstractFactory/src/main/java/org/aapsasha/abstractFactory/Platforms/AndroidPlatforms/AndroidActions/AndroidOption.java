package org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidActions;

import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IOption;

public class AndroidOption extends IOption {
    @Override
    public String toString(){
        return "IOS " + super.toString();
    }
}
