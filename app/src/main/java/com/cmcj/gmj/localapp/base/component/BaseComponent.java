package com.cmcj.gmj.localapp.base.component;

import com.cmcj.gmj.localapp.base.presenter.BasePresenter;

/**
 * Created by guomaojian on 16/11/16.
 */

public interface BaseComponent<P extends BasePresenter> {
    
    public P getPresenter();
}
