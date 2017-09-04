function insertSidebar() {
    // 找到 sidebar 组件容器
    var container = document.getElementById("sidebar-container");

    var sidebar = document.createElement('sidebar');

    // 注入组件
    container.appendChild(sidebar);
}

insertSidebar();


var sidebar = Vue.extend({
    template: '\
    <div id="sidebar-nav" class="sidebar">\
        <div class="sidebar-scroll">\
            <nav>\
                <ul class="nav">\
                    <li :class="{\'active\':isHomeActive}"><a href="index.html" class="active" :class=""><i class="lnr lnr-home"></i> <span>主页</span></a></li>\
                    <li :class="{\'active\':isWHActive}" v-if="isWHStaff"><a href="#warehouse-sub-pages" data-toggle="collapse" class="collapsed"><i class="fa fa-cubes"></i><span>仓储</span><i class="icon-submenu lnr lnr-chevron-left"></i></a>\
                        <div id="warehouse-sub-pages" class="collapse">\
                            <ul class="nav">\
                                <li><a href="page-profile.html" class=""><i class="fa fa-cube"></i><span>仓储管理</span></a></li>\
                                <li><a href="page-login.html" class=""><i class="fa fa-plus"></i><span>采购入库</span></a></li>\
                                <li><a href="page-lockscreen.html" class=""><i class="fa fa-sign-out"></i><span>出库</span></a></li>\
                                <li><a href="page-lockscreen.html" class=""><i class="fa fa-thermometer-empty" aria-hidden="true"></i><span>即将过期</span></a></li>\
                                <li><a href="panels.html" class=""><i class="fa fa-line-chart"></i> <span>统计数据</span></a></li>\
                            </ul>\
                        </div>\
                    </li>\
                    <li :class="{\'active\':isSaleActive}" v-if="isSaleStaff"><a href="#sale-sub-pages" data-toggle="collapse" class="collapsed"><i class="fa fa-jpy"></i><span>销售</span><i class="icon-submenu lnr lnr-chevron-left"></i></a>\
                        <div id="sale-sub-pages" class="collapse">\
                            <ul class="nav">\
                                <li><a href="page-profile.html" class=""><i class="fa fa-barcode" aria-hidden="true"></i><span>订单</span></a></li>\
                                <li><a href="page-login.html" class=""><i class="fa fa-address-card" aria-hidden="true"></i><span>会员信息</span></a></li>\
                                <li><a href="page-lockscreen.html" class=""><i class="fa fa-quora"></i><span>查询</span></a></li>\
                                <li><a href="panels.html" class=""><i class="fa fa-line-chart"></i> <span>统计数据</span></a></li>\
                            </ul>\
                        </div>\
                    </li>\
                    <li :class="{\'active\':isFinActive}" v-if="isFinStaf"><a href="#finance-sub-pages" data-toggle="collapse" class="collapsed"><i class="fa fa-diamond"></i><span>财务</span><i class="icon-submenu lnr lnr-chevron-left"></i></a>\
                        <div id="finance-sub-pages" class="collapse">\
                            <ul class="nav">\
                                <li><a href="page-profile.html" class=""><i class="fa fa-plus-square"></i><span>收入</span></a></li>\
                                <li><a href="page-login.html" class=""><i class="fa fa-minus-square"></i><span>支出</span></a></li>\
                                <li><a href="elements.html" class=""><i class="fa fa fa-truck"></i> <span>进货单审核</span></a></li>\
                                <li><a href="page-lockscreen.html" class=""><i class="fa fa-quora"></i><span>查询</span></a></li>\
                                <li><a href="panels.html" class=""><i class="fa fa-line-chart"></i> <span>统计数据</span></a></li>\
                            </ul>\
                        </div>\
                    </li>\
                    <li :class="{\'active\':isPurActive}" v-if="isPurStaf"><a href="elements.html" class=""><i class="fa fa fa-truck"></i> <span>采购</span></a></li>\
                    <li :class="{\'active\':isStafActive}" v-if="isStafMangr"><a href="charts.html" class=""><i class="fa fa fa-users"></i> <span>用户管理</span></a></li>\
                    <li :class="{\'active\':isBossActive}" v-if="isBoss"><a href="panels.html" class=""><i class="fa fa-line-chart"></i> <span>统计数据</span></a></li>\
                </ul>\
            </nav>\
        </div>\
    </div>\
    ',

    data: function() {
        return {
            isWHStaff: true,
            isSaleStaff: true,
            isFinStaf: true,
            isPurStaf: true,
            isStafMangr: true,
            isBoss: true,
            isHomeActive: true,
            isSaleActive: true,
            isWHActive: true,
            isFinActive: true,
            isPurActive: true,
            isStafActive: true,
            isBossActive: true
        }
    }
})

var vm_sidebar = new Vue({
    el: '#sidebar-container',
    data: {
        message: 'This is a message from vm'
    },
    components: {
        'sidebar' : sidebar
    }
})
