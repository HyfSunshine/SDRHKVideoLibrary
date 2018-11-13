package com.sdr.hklibrary.ui;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.sdr.hklibrary.contract.HKPlayContract;
import com.sdr.hklibrary.data.HKItemControl;
import com.sdr.lib.mvp.AbstractView;
import com.sdr.lib.ui.tree.TreeNode;

import java.util.List;

/**
 * Created by HyFun on 2018/11/13.
 * Email: 775183940@qq.com
 * Description:
 */

public class HKMainRecyclerAdapter extends BaseQuickAdapter<HKItemControl, BaseViewHolder> implements HKPlayContract.View {

    private AbstractView view;
    private List<TreeNode> treeNodeList;

    public HKMainRecyclerAdapter(int layoutResId, @Nullable List<HKItemControl> data, AbstractView abstractView, List<TreeNode> treeNodeList) {
        super(layoutResId, data);
        this.view = abstractView;
        this.treeNodeList = treeNodeList;
    }

    @Override
    protected void convert(BaseViewHolder helper, HKItemControl item) {

    }

    @Override
    public void showLoadingDialog(String message) {
        view.showLoadingDialog(message);
    }

    @Override
    public void hideLoadingDialog() {
        view.hideLoadingDialog();
    }

    @Override
    public void showErrorMessage(String message) {
        view.showErrorMsg(message);
    }
}
