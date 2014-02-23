//
//  robovm_native.m
//  robovm-native
//
//  Created by Stephen More on 1/24/14.
//  Copyright (c) 2014 HelloWorld. All rights reserved.
//

#import "robovm_native.h"
#import <UIKit/UIKit.h>

@implementation robovm_native

-(void)displayAlert{
    UIAlertView *alert = [[UIAlertView alloc]
                          initWithTitle: @"Announcement"
                          message: @"This IS robovm!"
                          delegate: nil
                          cancelButtonTitle:@"OK"
                          otherButtonTitles:nil];
    [alert show];
}

-(int) doubleUp:(int)a {
    return a * 2;
}

-(int)add:(int)a :(int)b {
    return a + b;
}

-(void)getData {
    NSLog(@"getData");
    
    NSURL *url = [NSURL URLWithString:@"http://api.kivaws.org/v1/loans/search.json?status=fundraising"];
    NSError* error = nil;
    NSData *jsonDataString = [[NSString stringWithContentsOfURL:url encoding:NSUTF8StringEncoding error: nil] dataUsingEncoding:NSUTF8StringEncoding];
    if (jsonDataString == nil )
    {
        NSLog(@"%@",[error localizedDescription]);
        return;
    }
    
    NSDictionary *json = [NSJSONSerialization JSONObjectWithData:jsonDataString options:NSJSONReadingMutableContainers | NSJSONReadingMutableLeaves error:&error];
    
    if( json == nil )
    {
        NSLog(@"%@",[error localizedDescription]);
        return;
    }
    NSLog(@"json: %@", json);
    
    NSArray* latestLoans = [json objectForKey:@"loans"];
    NSLog(@"loans: %@", latestLoans);

}

@end
