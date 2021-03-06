/*
 *  (C) Copyright 2018 fintrace (https://fintrace.org/) and others.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.fintrace.keycloak.events;

import org.keycloak.events.Event;
import org.keycloak.events.admin.AdminEvent;

/**
 * @author <a href="mailto:koneru.chowdary@gmail.com">Venkaiah Chowdary Koneru</a>
 */
public interface EventPublisher {

    /**
     * publishes event
     *
     * @return true if operation is successful otherwise false
     */
    boolean sendEvent(Event event);

    /**
     * publishes admin event
     *
     * @return true if operation is successful otherwise false
     */
    boolean sendEvent(AdminEvent adminEvent);
}
