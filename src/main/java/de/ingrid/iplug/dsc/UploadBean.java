/*
 * **************************************************-
 * ingrid-iplug-excel
 * ==================================================
 * Copyright (C) 2014 - 2020 wemove digital solutions GmbH
 * ==================================================
 * Licensed under the EUPL, Version 1.1 or – as soon they will be
 * approved by the European Commission - subsequent versions of the
 * EUPL (the "Licence");
 * 
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * 
 * http://ec.europa.eu/idabc/eupl5
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 * **************************************************#
 */
package de.ingrid.iplug.dsc;

import org.springframework.web.multipart.MultipartFile;

public class UploadBean {

    private MultipartFile _multipartFile;

    /**
     * Get file for upload.
     * 
     * @return 
     *      A multipart file.
     */
    public MultipartFile getFile() {
        return _multipartFile;
    }

    /** Set file for upload.
     * 
     * @param multipartFile
     */
    public void setFile(MultipartFile multipartFile) {
        _multipartFile = multipartFile;
    }

}
