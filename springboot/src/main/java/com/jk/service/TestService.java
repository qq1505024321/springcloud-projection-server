package com.jk.service;

import java.util.Map;

public interface TestService {
    Map<String, Object> queryBook(Integer page, Integer limit);
}
