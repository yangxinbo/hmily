/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hmily.tcc.motan.service;

import com.hmily.tcc.core.service.ApplicationService;
import com.weibo.api.motan.config.springsupport.BasicServiceConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author xiaoyu
 */
@Service
public class MotanApplicationServiceImpl implements ApplicationService {


    private final BasicServiceConfigBean basicServiceConfigBean;

    @Autowired
    public MotanApplicationServiceImpl(BasicServiceConfigBean basicServiceConfigBean) {
        this.basicServiceConfigBean = basicServiceConfigBean;
    }


    /**
     * 获取applicationName
     *
     * @return applicationName
     */
    @Override
    public String acquireName() {
        return basicServiceConfigBean.getModule();
    }
}
