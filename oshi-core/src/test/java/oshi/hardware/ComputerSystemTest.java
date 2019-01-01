/**
 * OSHI (https://github.com/oshi/oshi)
 *
 * Copyright (c) 2010 - 2019 The OSHI Project Team:
 * https://github.com/oshi/oshi/graphs/contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package oshi.hardware;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import oshi.SystemInfo;

/**
 * Tests Computer System
 */
public class ComputerSystemTest {

    /**
     * Test Computer System
     */
    @Test
    public void testComputerSystem() {
        SystemInfo si = new SystemInfo();
        ComputerSystem cs = si.getHardware().getComputerSystem();
        assertNotNull(cs.getManufacturer());
        assertNotNull(cs.getModel());
        assertNotNull(cs.getSerialNumber());

        Firmware fw = cs.getFirmware();
        assertNotNull(fw);
        assertNotNull(fw.getManufacturer());
        assertNotNull(fw.getName());
        assertNotNull(fw.getDescription());
        assertNotNull(fw.getVersion());
        assertNotNull(fw.getReleaseDate());

        Baseboard bb = cs.getBaseboard();
        assertNotNull(bb);
        assertNotNull(bb.getManufacturer());
        assertNotNull(bb.getModel());
        assertNotNull(bb.getVersion());
        assertNotNull(bb.getSerialNumber());
    }
}
