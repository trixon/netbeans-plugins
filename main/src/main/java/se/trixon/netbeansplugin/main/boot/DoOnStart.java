/*
 * Copyright 2024 Patrik Karlström <patrik@trixon.se>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package se.trixon.netbeansplugin.main.boot;

import org.openide.modules.OnStart;
import org.openide.util.NbPreferences;
import se.trixon.almond.nbp.NbHelper;
import se.trixon.almond.nbp.dialogs.NbOptionalDialog;

/**
 *
 * @author Patrik Karlström
 */
@OnStart
public class DoOnStart implements Runnable {

    static {
        NbHelper.setLafDefault("Light");
        NbHelper.initNightModeIfNeeded();

        NbOptionalDialog.setPreferences(NbPreferences.forModule(NbOptionalDialog.class).node("optionalDialogState"));
    }

    @Override
    public void run() {
    }

}
