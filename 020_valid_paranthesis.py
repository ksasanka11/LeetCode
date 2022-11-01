class Solution:
    def isValid(self, s: str) -> bool:
        paran = []
        valid_paran = {
            '(': ')',
            '{': '}',
            '[': ']'
        }
        for i in range(len(s)):
            if s[i] in '({[':
                paran.append(s[i])
            else:
                if len(paran) < 1:
                    return False
                if s[i] == valid_paran[paran[-1]]:
                    paran.pop()
                else:
                    return False
            # print(paran)
        
        return len(paran) == 0