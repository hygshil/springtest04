package springzuoyeaop02;

import org.springframework.stereotype.Service;


@Service("tvService")
public class TvServiceImpl implements TvService{
    @Override
    public void start() {
        System.out.println("播放");
    }

    @Override
    public void stop() {
        System.out.println("暂停");
    }

    @Override
    public void zhuanMoney() {
        System.out.println("转金币");
    }

    @Override
    public void findNo() {
        int nkjnkj=9/0;
        System.out.println("视频找不见了");
    }
}
