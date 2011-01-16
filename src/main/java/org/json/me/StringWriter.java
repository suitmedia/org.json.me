/*
 * Copyright 2011 Upic
 * 
 * This file is part of org.json.me.
 *
 * org.json.me is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * org.json.me is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with org.json.me. If not, see <http://www.gnu.org/licenses/>.
 */
package org.json.me;

import java.io.IOException;
import java.io.Writer;

/**
 * A simple StringBuffer-based implementation of StringWriter
 */
public class StringWriter extends Writer {
    
    final private StringBuffer buf;
    
    public StringWriter() {
        super();
        buf = new StringBuffer();
    }
    
    public StringWriter(int initialSize) {
        super();
        buf = new StringBuffer(initialSize);
    }
    
    public void write(char[] cbuf, int off, int len) throws IOException {
        buf.append(cbuf, off, len);
    }

    public void write(String str) throws IOException {
        buf.append(str);
    }

    public void write(String str, int off, int len) throws IOException {
        buf.append(str.substring(off, len));
    }

    public void flush() throws IOException {
    }

    public void close() throws IOException {
    }
}
