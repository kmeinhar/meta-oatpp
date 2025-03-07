#############################################################################
#
# Project         _____    __   ____   _      _
#                (  _  )  /__\ (_  _)_| |_  _| |_
#                 )(_)(  /(__)\  )( (_   _)(_   _)
#                (_____)(__)(__)(__)  |_|    |_|
#
#
# Copyright 2021-present, Benedikt-Alexander Mokroß <github@bamkrs.de>
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
#############################################################################

DESCRIPTION = "Oat++ Swagger (OAS 3.0)" 
inherit oatpp-module

PACKAGES += " -ui"

RESIDR = "/oatpp-/bin/oatpp-swagger/res"
FILES_-ui = " \
    /swagger-ui.js.map \
    /swagger-ui-standalone-preset.js \
    /swagger-ui.css \
    /swagger-ui.js \
    /swagger-ui-es-bundle-core.js \
    /swagger-ui-es-bundle-core.js.map \
    /swagger-ui-bundle.js \
    /favicon-32x32.png \
    /favicon-16x16.png \
    /swagger-ui-es-bundle.js \
    /swagger-ui-es-bundle.js.map \
    /oauth2-redirect.html \
    /swagger-ui-standalone-preset.js.map \
    /index.html \
    /swagger-ui-bundle.js.map \
    /swagger-ui.css.map \
"
