/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.apache.commons.imaging.formats.xbm;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImagingParameters;

/**
 * Xbm format parameters.
 * @since 1.0-alpha3
 */
public class XbmImagingParameters extends ImagingParameters {

    public XbmImagingParameters() {
        setImageFormat(ImageFormats.XBM);
    }
}
