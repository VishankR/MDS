package com.mds.commonlibraries;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mds.*")
@EntityScan("com.mds.*")
public class CommonLibrariesApplication {

}
