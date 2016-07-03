# study-selenium
Seleniumの学習用

## ChromeDriver
https://sites.google.com/a/chromium.org/chromedriver/downloads
Latest Release: ChromeDriver 2.22   2016/07/04 now

## IEDriver
http://www.seleniumhq.org/download/

### IE保護モード設定
IE -> インターネットオプション -> セキュリティ -> 全モードで「保護モードを有効にする」にチェック　※要ブラウザ再起動
IE -> インターネットオプション -> 詳細設定 -> 「拡張保護モードを有効にする」のチェックを外す   ※要PC再起動
★IE11：レジストリ設定★
【32bit】EY_LOCAL_MACHINE\SOFTWARE\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BFCACHE
【64bit】HKEY_LOCAL_MACHINE\SOFTWARE\Wow6432Node\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BFCACHE
上記のキーに対して「iexplore.exe」というDWORD値を新規に作成して値を「0」にしておく
FEATURE_BFCACHEが存在しない場合は作成する
