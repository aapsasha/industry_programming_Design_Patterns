package org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidVersion1p0;

import org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidVersion1p0.AndroidVersion1p0Actions.AndroidVersion1p0Action;
import org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidVersion1p0.AndroidVersion1p0Actions.AndroidVersion1p0Option;
import org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidVersion1p0.AndroidVersion1p0Actions.AndroidVersion1p0SuperAction;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IAction;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IOption;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.ISuperAction;
import org.aapsasha.abstractFactory.Platforms.IParts.IPlatformFactory;

public class AndroidVersion1p0Factory extends IPlatformFactory {
    @Override
    public IAction createAction() {
        return new AndroidVersion1p0Action();
    }

    @Override
    public IOption createOption() {
        return new AndroidVersion1p0Option();
    }

    @Override
    public ISuperAction createSuperAction() {
        return new AndroidVersion1p0SuperAction();
    }
}
