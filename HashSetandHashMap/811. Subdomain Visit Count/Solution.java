class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        Map<String, Integer> map = new HashMap();
        int times = 0;
        String[] countDomain = new String[2];
        List<String> list;
        for(int i = 0; i < cpdomains.length; i++){
            countDomain = cpdomains[i].split(" ");
            times = Integer.parseInt(countDomain[0]);
            list = computeDomain(countDomain[1]);
            for(int j = 0; j < list.size(); j++){
                map.put(list.get(j), map.getOrDefault(list.get(j), 0) + times);
            }
        }
        
        List<String> res = new ArrayList<String>();
        
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        
        for(Map.Entry<String, Integer> m : set){
            res.add(m.getValue() + " " + m.getKey());
        }
        
        return res;
        
    }
    
    
    private List<String> computeDomain(String domain){
        String[] domains = domain.split("\\.");
        List<String> list = new ArrayList();
        if(domains.length == 2){
            list.add(domain);
            list.add(domains[1]);
        }
        
        if(domains.length == 3){
            list.add(domain);
            list.add(domains[1]+ "." + domains[2]);
            list.add(domains[2]);
        }
        
        return list;
    }
}