package com.rbkmoney.newway.dao.party.impl;

import com.rbkmoney.newway.AbstractIntegrationTest;
import com.rbkmoney.newway.dao.party.iface.ShopDao;
import com.rbkmoney.newway.domain.tables.pojos.Shop;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static io.github.benas.randombeans.api.EnhancedRandom.random;
import static org.junit.Assert.*;

public class ShopDaoImplTest extends AbstractIntegrationTest {

    @Autowired
    private ShopDao shopDao;

    @Test
    public void test() {
        Shop shop = random(Shop.class);
        shop.setCurrent(true);
        shopDao.save(shop);
        Shop shopGet = shopDao.get(shop.getPartyId(), shop.getShopId());
        assertEquals(shop, shopGet);
        List<Shop> shops = shopDao.getByPartyId(shop.getPartyId());
        assertEquals(1, shops.size());
        assertEquals(shop, shops.get(0));
        shopDao.updateNotCurrent(shop.getPartyId(), shop.getShopId());
        assertNull(shopDao.get(shop.getPartyId(), shop.getShopId()));
    }
}