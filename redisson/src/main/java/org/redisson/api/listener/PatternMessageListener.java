/**
 * Copyright (c) 2013-2024 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.api.listener;

import java.util.EventListener;

/**
 * Listener for Redis messages published via RTopic Redisson object
 *
 * @author Nikita Koksharov
 *
 * @param <M> message
 *
 * @see org.redisson.api.RTopic
 */
public interface PatternMessageListener<M> extends EventListener {

    /**
     * Invokes on every message in topic
     *
     * @param pattern of channel name
     * @param channel of topic
     * @param msg topic message
     */
    void onMessage(CharSequence pattern, CharSequence channel, M msg);

}
