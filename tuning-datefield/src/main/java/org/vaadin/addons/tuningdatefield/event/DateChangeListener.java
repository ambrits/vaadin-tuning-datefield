/*
 * Copyright (C) 2013 Frederic Dreyfus
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.vaadin.addons.tuningdatefield.event;

import java.io.Serializable;

import org.joda.time.LocalDate;
import org.vaadin.addons.tuningdatefield.TuningDateField;

/**
 * Interface for listening for a {@link DateChangeEvent} fired by a {@link TuningDateField}.
 * 
 * @author Frederic.Dreyfus
 */
public interface DateChangeListener extends Serializable {

    /**
     * Called when the month a {@link TuningDateField} calendar has been changed.
     * 
     * @param event
     *            An event containing the new {@link LocalDate} of the calendar.
     */
    public void dateChange(DateChangeEvent event);

}
