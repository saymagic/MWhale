/*
 * Copyright (c) 2016 saymagic <saymagic.dev@gmail.com>
 *
 * This file is a part of project DockerAndroid
 *
 * Licensed under the Apache License, Version 2.0 (the "License”);
 */
package com.dockerandroid.data.dbo;

/**
 * Created by saymagic on 2016/1/7.
 */

public interface DboTransform<B> {

    public B transformToDbo();

}
