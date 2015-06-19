/*
 * Copyright (c)  [2011-2015] "Neo Technology" / "Graph Aware Ltd."
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with separate copyright notices and license terms. Your use of the source code for these subcomponents is subject to the terms and conditions of the subcomponent's license, as noted in the LICENSE file.
 *
 *
 */

package school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.domain.Subject;
import school.service.Service;
import school.service.SubjectService;

@RestController
@RequestMapping(value = "/api/subjects")
public class SubjectController extends Controller<Subject> {

    @Autowired
    private SubjectService subjectService;

    @Override
    public Service<Subject> getService() {
        return subjectService;
    }

}