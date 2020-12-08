package com.alibaba.csp.sentinel.dashboard.repository.rule.nacos;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.RuleEntity;
import com.alibaba.csp.sentinel.dashboard.discovery.MachineInfo;
import com.alibaba.csp.sentinel.dashboard.repository.rule.RuleRepository;
import com.alibaba.nacos.api.config.ConfigService;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class NacosSystemRuleStore<T extends RuleEntity> implements RuleRepository<T, Long> {


  @Autowired
  private ConfigService configService;

  @Override
  public T save(T entity) {
    if (entity.getId() == null) {
      entity.setId(nextId());
    }



    return null;
  }



  @Override
  public List<T> saveAll(List<T> rules) {
    return null;
  }

  @Override
  public T delete(Long aLong) {
    return null;
  }

  @Override
  public T findById(Long aLong) {
    return null;
  }

  @Override
  public List<T> findAllByMachine(MachineInfo machineInfo) {
    return null;
  }

  @Override
  public List<T> findAllByApp(String appName) {
    return null;
  }

  // TODO 实现
  private static AtomicLong ids = new AtomicLong(0);
  protected long nextId() {
    return ids.incrementAndGet();
  }

}
