package org.gwtbootstrap3.extras.summernote.client.event;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap3
 * %%
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
 * #L%
 */

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.Event;
import org.gwtbootstrap3.extras.summernote.client.ui.base.SummernoteBase;



/**
 * @author martin.matthias
 */
public class SummernoteOnPasteEvent extends GwtEvent<SummernoteOnPasteHandler> implements SummernoteEvent {

    private static final Type<SummernoteOnPasteHandler> TYPE = new Type<SummernoteOnPasteHandler>();

    private final SummernoteBase summernote;
    private final Event nativeEvent;

    public static Type<SummernoteOnPasteHandler> getType() {
        return TYPE;
    }

    public SummernoteOnPasteEvent(final SummernoteBase summernote, final Event nativeEvent) {
        this.summernote = summernote;
        this.nativeEvent = nativeEvent;
    }

    @Override
    public SummernoteBase getSummernote() {
        return summernote;
    }

    @Override
    public Event getNativeEvent() {
        return nativeEvent;
    }

    @Override
    public Type<SummernoteOnPasteHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(final SummernoteOnPasteHandler handler) {
        handler.onPaste(this);
    }
}