/*
 * Copyright 2012-2015 One Platform Foundation
 * Copyright 2016 AppScatter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.appscatter.iab.core.model.event.android;

import com.appscatter.iab.core.model.ComponentState;
import com.appscatter.iab.core.model.event.ASEvent;

public abstract class LifecycleEvent implements ASEvent {

    @ComponentState
    private final int type;

    public LifecycleEvent(@ComponentState final int type) {
        this.type = type;
    }

    /**
     * Gets lifecycle type associated with this event.
     *
     * @return Lifecycle type, can't be null.
     */
    @ComponentState
    public int getType() {
        return type;
    }

}
