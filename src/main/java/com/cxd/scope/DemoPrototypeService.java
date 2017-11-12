package com.cxd.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/26
 * Description:
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
