package com.symphony.devsol.federation.activity;

import com.symphony.bdk.workflow.swadl.v1.activity.BaseActivity;
import com.symphony.devsol.federation.model.ExternalNetwork;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class AddConnectEntitlement extends BaseActivity {
  private String advisorEmailAddress;
  private long symphonyId;
  private ExternalNetwork externalNetwork;
}
