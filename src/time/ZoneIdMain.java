package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        /*
        *   1. ZoneId.of(availableZoneId):
            이 부분은 주어진 문자열(availableZoneId)을 사용하여 해당 타임존을 나타내는 ZoneId 객체를 생성합니다.
            예를 들어, "Asia/Seoul"을 전달하면 ZoneId.of("Asia/Seoul")은 서울의 타임존을 나타내는 ZoneId 객체를 반환합니다.
            이때, zoneId.toString()을 출력하면 타임존의 ID, 즉 "Asia/Seoul"과 같은 타임존 이름이 출력됩니다.
            *
            2. zoneId.getRules():
            zoneId.getRules()는 해당 ZoneId에 대한 시간대 규칙(ZoneRules)을 반환합니다.
            ZoneRules는 그 타임존이 어떤 시간대에 속해 있는지, 그리고 해당 시간대의 규칙(예: 표준 시간대 오프셋, 서머타임 시작과 끝 등)에 대한 정보를 포함하고 있습니다.
            예를 들어, "Asia/Seoul"에 대해 zoneId.getRules()를 호출하면 서울 시간대의 현재 UTC 오프셋(예: UTC+09:00)과 해당 타임존에 대한 규칙 정보를 포함한 객체가 반환됩니다.
            *
            오해를 바로잡기:
            zoneId.getRules(): 이 메서드는 해당 타임존의 규칙(예: UTC 오프셋, 서머타임 정보 등)을 제공하는 것이지, "모든 세계 시간"을 반환하는 것은 아닙니다. 즉, 이 규칙 객체는 특정 시간대의 현재 시간 오프셋과 적용되는 규칙들을 나타냅니다.
            정리:
            ZoneId.of(availableZoneId)는 특정 타임존의 ZoneId 객체를 생성합니다.
            zoneId.getRules()는 해당 타임존에 대한 시간대 규칙(예: UTC 오프셋 및 서머타임 규칙)을 반환합니다.
            이 두 가지를 사용하면 특정 타임존에 대한 정보를 확인할 수 있지만, getRules()가 "모든 세계 시간"을 반환하는 것은 아니며, 각 타임존의 규칙만을 반환합니다.
        * */

        ZoneId zoneId = ZoneId.systemDefault(); // 시스템 기본 타임존 반환 (예: Asia/Seoul) 현재 운영체제가 사용하는 시스템 타임존을 반환
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul"); // 서울 타임존 반환 (예: Asia/Seoul)
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}