##MEVSIM SIMULATOR

    Belirli bir bölgedeki kara, deniz, hava canlılarının mevsim mevsim beslenme, yaşama ve ölüm olaylarının
    simüle edilmesini amaçlar. İlkbahar, Yaz, Sonbahar, Kış olmak üzere 4 adet mevsim simülasyon edilecektir.
    Her mevsimin sıcaklık koşulları kara, deniz ve hava için farklı farklıdır. Mevsim en düşük ve en yüksek sıcaklıkları
    aşağıdaki gibi olacaktır. Mevsim normalleri ise (kara, deniz, hava için ayrı ayrı şekilde) kullanıcı tarafından
    girilmelidir. Kullanıcının girmiş olduğu mevsim normal sıceklığı belirli bir aralıkta olmalıdır. Her bir mevsim
    normal değeri için aralıklar aşağıda tanımlanmıştır.
    
####MEVSİMLER

    Simulasyonda 4 mevsim simule edilecektir. Mevsimler sırasıyla Ilkbahar, Yaz, Sonbahar, Kıs'dır. Her mevsimin minimum ve maksimum sıcaklık degerleri
    asagidaki gibi tanimlidir. Mevsim normalleri ise kullanıcı tarafindan girilmelidir. Mevsim sicakliklari karada, denizde ve havada farkli sekilde seyreder. Kullanici
    3 ortam icinde mevsim normallerini girmelidir. Bir mevsim icin her gun ortam sicakligi (Kara, Deniz, Hava icin ayri ayri) hesaplanmalidir. Hesaplanma su kritere gore
    yapilacaktir:
    Örnegin, Ilkbahar mevsiminde Kara ortamı icin sicaklik degerleri su sekilde olsun;
        Minimum Sıcaklık: 10
        Normal Sıcaklık: Kullanıcı tarafından girilecek
            * Kabul edilebilir aralık = [Min.Sıcaklık + 5, Max.Sıcaklık - 5] 
        Maximum Sıcaklık: 30
        
        Kullanicinin mevsim normallerini 20 olarak girmis oldugunu varsayarsak mevsim sicakliklari asagidaki hali alir. Asagidaki sicaklik degerlerinden yola cikilarak
        gunluk sicaklik degerinin hesaplanacagi araliklar (Her bir araligin farkli olasilik degeri vardir) belirlenir. 
        Minimum Sıcaklık: 10
        Normal Sıcaklık: 20 
        Maximum Sıcaklık: 30
        Araliklar belirlenirken mevsim normallerinin kabul edilebilir araliginda kullanilan rakamdan yararlanilir (* Kabul edilebilir aralık = [Min.Sıcaklık + 5, Max.Sıcaklık - 5]). 
        Ilk aralik : [10, normal_sicaklik - 5/2) --> Olasilik %25
        Ikinci aralik : [normal_sicaklik - 5/2, normal_sicaklik + 5/2) --> Olasilik %50
        Ucuncu aralik : [normal_sicaklik + 5/2, 30] --> Olasilik %25
        
#####Ilkbahar

        Uzunluk: 90 gün
        Karada:
            Minimum Sıcaklık: 15.5
            Normal Sıcaklık: Kullanıcı tarafından girilecek
                * Kabul edilebilir aralık = [Min.Sıcaklık + 4, Max.Sıcaklık - 4] 
            Maximum Sıcaklık: 27.9
            
        Denizde:
            Minimum Sıcaklık: 8.6
            Normal Sıcaklık: Kullanıcı tarafından girilecek
                * Kabul edilebilir aralık = [Min.Sıcaklık + 5, Max.Sıcaklık - 5]
            Maximum Sıcaklık: 23.4
            
        Havada:
            Minimum Sıcaklık: 12
            Normal Sıcaklık: Kullanıcı tarafından girilecek
                * Kabul edilebilir aralık = [Min.Sıcaklık + 6, Max.Sıcaklık - 6]
            Maximum Sıcaklık: 26
 
#####Yaz

        Uzunluk: 90 gün
        Karada:
            Minimum Sıcaklık: 35.3
            Normal Sıcaklık: Kullanıcı tarafından girilecek
                * Kabul edilebilir aralık = [Min.Sıcaklık + 6, Max.Sıcaklık - 6]
            Maximum Sıcaklık: 52
            
        Denizde:
            Minimum Sıcaklık: 24
            Normal Sıcaklık: Kullanıcı tarafından girilecek
                * Kabul edilebilir aralık = [Min.Sıcaklık + 4, Max.Sıcaklık - 4]
            Maximum Sıcaklık: 39.6
            
        Havada:
            Minimum Sıcaklık: 26.1
            Normal Sıcaklık: Kullanıcı tarafından girilecek
                * Kabul edilebilir aralık = [Min.Sıcaklık + 5, Max.Sıcaklık - 5]
            Maximum Sıcaklık: 38.3     
#####Sonbahar

        Uzunluk: 90 gün
        Karada:
            Minimum Sıcaklık: 11.7
            Normal Sıcaklık: Kullanıcı tarafından girilecek
                * Kabul edilebilir aralık = [Min.Sıcaklık + 3, Max.Sıcaklık - 3]
            Maximum Sıcaklık: 20.1
            
        Denizde:
            Minimum Sıcaklık: 4.3
            Normal Sıcaklık: Kullanıcı tarafından girilecek
                * Kabul edilebilir aralık = [Min.Sıcaklık + 5, Max.Sıcaklık - 5]
            Maximum Sıcaklık: 19
            
        Havada:
            Minimum Sıcaklık: 10
            Normal Sıcaklık: Kullanıcı tarafından girilecek
                * Kabul edilebilir aralık = [Min.Sıcaklık + 3, Max.Sıcaklık - 3]
            Maximum Sıcaklık: 18.6
#####Kış

        Uzunluk: 90 gün
        Karada:
            Minimum Sıcaklık: -10.5
            Normal Sıcaklık: Kullanıcı tarafından girilecek
                * Kabul edilebilir aralık = [Min.Sıcaklık + 5, Max.Sıcaklık - 5]
            Maximum Sıcaklık: 7.7
            
        Denizde:
            Minimum Sıcaklık: -15.7
            Normal Sıcaklık: Kullanıcı tarafından girilecek
                * Kabul edilebilir aralık = [Min.Sıcaklık + 4, Max.Sıcaklık - 4]
            Maximum Sıcaklık: 4
            
        Havada:
            Minimum Sıcaklık: -9
            Normal Sıcaklık: Kullanıcı tarafından girilecek
                * Kabul edilebilir aralık = [Min.Sıcaklık + 3, Max.Sıcaklık - 3]
            Maximum Sıcaklık: 8
 
###CANLILAR

    Bölgede yaşayan canlılar Kara Canlıları, Deniz Canlıları ve Hava Canlıları olmak üzere üç gruba ayrılmaktadır. Her bir
    canlı grubunda 2 ayrı tür bulunmaktadır. Tüm türler aşağıda sıralanmıştır. Tüm canlılar ortamda bulunan (kara, deniz, hava
    için ayrı ayrı) besinden belirli aralıklarla beslenirler. Olumsuz sıcaklık koşulları ve açlık durumlarından etkilenerek
    hastalanırlar. Hastalığın bellirli bir süre devam etmesi hayvanların ölmesine neden olur ve vücüt ağırlıklarının belli bir oranı
    ortam besinine (kara, deniz, hava için ayrı ayrı) dahil edilir.
    
    Kurallar:
    - Her canlının günde bir, günde iki, ..., hafta da bir şeklinde yemek yeme sıklığı vardır.
    - Her canlı vücut ağırlığının belli bi oranı kadar beslenmek zorundadır. Bu oran sıcaklık ve açlık koşullarından etkilenmez.
        Örneğin; 100 kg vucüt ağırlığına sahip bir İnsan canlısının beslenme oranı %5 olursa beslenmesi gereken miktar 5 kg olur ve
        beslendikten sonraki vücut ağırlığı 105 kg olur.
    - Her canlı günün sonunda günlük aktivitelerinden ötürü vücut ağırlığının belli bir oranı kadar ağırlık kaybeder. Bu oran neredeyse
    beslenme oranı ile aynı olur. Bu oran sıcaklık ve açlık koşullarından etkilenmez.
        Örneğin; 100 kg vucüt ağırlığına sahip bir İnsan canlısının günlük aktivitelerde kaybedeceği ağırlık oranı %5 olursa kaybetmesi
        gereken ağırlık 5 kg olur ve günün sonundaki ağırlığı 95 kg olur.
        Günlük aktivite oranı belirlenirken kullanılacak aralık1 = [0, beslenme_oranı - beslenme_oranı/2] --> Olasılık : %30
        Günlük aktivite oranı belirlenirken kullanılacak aralık2 = [beslenme_oranı - beslenme_oranı/2, beslenme_oranı] --> Olasılık : %70
    - Her canlının sıcaklık ve açlık koşullarına bakılmaksızın küçük de olsa bir hastalanma ihtimali vardır. Bu ihtimal değeri %0,05'dir.
    - Herhangi bir canlının hastalanma ihtimali en fazla %100 olabilir. Bu durumda canlı kesinlikle hastalanacaktır. Hastalanma
    ihtimal değeri 100'ü geçemez.
    - Herhangi bir canlı, yemek sıklığı bir öğün alındığında; eğer 3 öğün yemek yememiş ise o canlının hastalanma ihtimali kümülatif
     olarak artar. Bu artış oranı 0,5'dir.
        Örneğin; bir canlının yemek yeme sıklığı günde bir olsun. Bu durumda yemek yedikten sonraki 3 gün yemek yemezse hastalanma
        ihtimali artar. Bu durumda hastalanma ihtimali 0,05 + 0,5 = %0,55 olur.
    - Bir canlı beslenmesi gereken miktarın en az %35'i kadarıyla beslenemez ise o öğün aç kalmış demektir.
        Örneğin; 100 kg ağırlığında bir canlının beslenme oranı %10 olduğunda beslenmesi gereken miktar 10 kg'dır. Canlının aç kalmaması
        için alması gereken en az besin miktarı (10'un %35'i) 3.5 kg'dır.
    - Uzun süre yemek yemediği için hastalanma ihtimali artan canlı yemek yediği zaman hastalanma ihtimali azalır. Bu azalış miktarı
    0,1'dir. Azalış mıktarı toplamı en fazla açlıktan dolayı meydana gelen artış miktarı toplamı kadar olabilir. Yani açlık nedeniyle
    toplamda 10,5 artış gösteren hastalanma ihtimali, yine açlığın giderilmesiyle toplamda en fazla 10,5 azalış gösterebilir.  
        Örneğin; yemek yeme sıklığı günde 1 olan canlı, 6 gün yemek yemediği zaman hastalanma ihtimali 1 (0,5 + 0,5) artarak %1,05 olur. Sonraki
        iki gün yemek yemesi durumunda hastalanma ihtimali 0,2 (0,1 + 0,1) azalır. Bu 8 (6 + 2) günün sonunda hastalanma ihtimali 
        1,05 - 0,2 = 0,85 yani %0,85 olur. 
    - Her canlı mevsimsel olarak ortam sıcaklığından etkilenir. Her canlının belirli bir vucüt sıcaklığı vardır ve ortam sıcaklığını 
    tolere edebileceği bir aralık vardır.
        Örneğin; cinsi İnsan olan bir canlının vücut sıcaklığı 36.5 derecedir. Ve ortam sıcaklığı tolerans aralığı 
        [36.5 - tolerans_degeri, 36.5 + tolerans_degeri] şeklindedir. 'tolerans_degeri' degiskeninin 10 olduğunu varsaydığımızda
        aralık değerleri [26.5, 46.5] olacaktır. Eğer İnsan canlısının bulunduğu ortamın sıcaklığı [26.5, 46.5] aralığında olmazsa
        hastalanma ihtimali artar. Bu artış miktarı 0,5'dir. Yani günün sonunda hatalanma ihtimali 0,05 + 05 = %0,55 olur.
    - Olumsuz ortam sıcaklığı hastalanma ihtimalinde artış meydana getirirken; ortam sıcaklığı canlının tolere edebileceği seviyeye
    geldiğinde hastalanma ihtimalinde azalış meydana gelir. Bu azalış 0,1'dir. Azalış mıktarı toplamı en fazla olumsuz ortam sıcaklığından
    dolayı meydana gelen artış miktarı toplamı kadar olabilir.
    - Hastalanan canlı hastalık durumu 3 gün devam ettiğinde ölür.
        Örneğin; %50 ihtimal ile hastalanan canlının sonraki günlerde hastalık durumunun devam edip etmemesi hastalanma ihtimali üzerinden
        hesaplanır. Sonraki 3 gün de hastalık durumunun devam etmesi halinde canlı ölür.
    - Ölen canlının vücut ağırlığının belli bir miktarı ortam besinine (ölen canlı hangi ortamda ayşıyor ise) dahil edilir.
    - Simülasyonun başlatılabilmesi için tüm mevsimlerin bilgileri eksiksiz olarak tamamlanmalıdır, tüm canlı türlerinden en az bir birey
    simülasyona dahil edilmelidir ve Kara, Deniz, Hava ortamları için besin miktarları belirlenmelidir.
    
####Kara Canlıları

    + İnsan
        - feedingPeriod: Günde bir
        - feedingPercent: %5
        - starvationPercent: %35
        - activityPercent:
            [0, 2.5) --> Olasılık: %30
            [2.5, 5] --> Olasılık: %70
        - diseasePercent: %0,05
        - diseaseIncreasePercent: %0,5
        - totalDiseaseIncreaseDueToTemperature: 
        - totalDiseaseIncreaseDueToStarvation:
        - diseaseDecreasePercent: %0,1
        - starvationPeriod: 3 Gün
        - toleranceValue: 10
        - bodyTemperature: 36.5
        - isDisease:
        - maxStarvationPeriod: 3 Gün
        - bodyWeight: 77
        - recyclingPercentAfterDeath: %65
        
    + Kurt
        - feedingPeriod: İki günde bir
        - feedingPercent: %8
        - starvationPercent: %35
        - activityPercent:
          [0, 4) --> Olasılık: %30
          [4, 8] --> Olasılık: %70
        - diseasePercent: %0,05
        - diseaseIncreasePercent: %0,5
        - totalDiseaseIncreaseDueToTemperature: 
        - totalDiseaseIncreaseDueToStarvation:
        - diseaseDecreasePercent: %0,1
        - starvationPeriod: 6 Gün
        - toleranceValue: 16
        - bodyTemperature: 38
        - isDisease:
        - maxStarvationPeriod: 3 Gün
        - bodyWeight: 80
        - recyclingPercentAfterDeath: %77
    
####Deniz Canlıları

    + Balina
        - feedingPeriod: Haftada bir
        - feedingPercent: %34
        - starvationPercent: %35
        - activityPercent:
          [0, 17) --> Olasılık: %30
          [17, 34] --> Olasılık: %70
        - diseasePercent: %0,05
        - diseaseIncreasePercent: %0,5
        - totalDiseaseIncreaseDueToTemperature: 
        - totalDiseaseIncreaseDueToStarvation:
        - diseaseDecreasePercent: %0,1
        - starvationPeriod: 14 Gün
        - toleranceValue: 8
        - bodyTemperature: 46
        - isDisease:
        - maxStarvationPeriod: 1 Hafta
        - bodyWeight: 1200
        - recyclingPercentAfterDeath: %93
        
    + Köpekbalığı
        - feedingPeriod: 4 günde bir
        - feedingPercent: %25
        - starvationPercent: %35
        - activityPercent:
          [0, 12.5) --> Olasılık: %30
          [12.5, 25] --> Olasılık: %70
        - diseasePercent: %0,05
        - diseaseIncreasePercent: %0,5
        - totalDiseaseIncreaseDueToTemperature: 
        - totalDiseaseIncreaseDueToStarvation:
        - diseaseDecreasePercent: %0,1
        - starvationPeriod: 12 Gün
        - toleranceValue: 6
        - bodyTemperature: 41
        - isDisease:
        - maxStarvationPeriod: 12 Gün
        - bodyWeight: 450
        - recyclingPercentAfterDeath: %67
    
####Hava Canlıları

    + Sinekkuşu
        - feedingPeriod: Günde bir
        - feedingPercent: %2
        - starvationPercent: %35
        - activityPercent:
          [0, 1) --> Olasılık: %30
          [1, 2] --> Olasılık: %70
        - diseasePercent: %0,05
        - diseaseIncreasePercent: %0,5
        - totalDiseaseIncreaseDueToTemperature: 
        - totalDiseaseIncreaseDueToStarvation:
        - diseaseDecreasePercent: %0,1
        - starvationPeriod: 3 Gün
        - toleranceValue: 3
        - bodyTemperature: 22
        - isDisease:
        - maxStarvationPeriod: 3 Gün
        - bodyWeight: 0,5
        - recyclingPercentAfterDeath: %40
        
    + Kartal
        - feedingPeriod: 3 Günde bir
        - feedingPercent: %13
        - starvationPercent: %35
        - activityPercent:
          [0, 6.5) --> Olasılık: %30
          [6.5, 13] --> Olasılık: %70
        - diseasePercent: %0,05
        - diseaseIncreasePercent: %0,5
        - totalDiseaseIncreaseDueToTemperature: 
        - totalDiseaseIncreaseDueToStarvation:
        - diseaseDecreasePercent: %0,1
        - starvationPeriod: 6 Gün
        - toleranceValue: 3
        - bodyTemperature: 27
        - isDisease:
        - maxStarvationPeriod: 3 Gün
        - bodyWeight: 10
        - recyclingPercentAfterDeath: %55